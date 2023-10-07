import { ReactNode } from "react";

interface AppHeaderProps {
  isHeader: boolean;
  leftIcon?: ReactNode;
  rightItem?: string;
  mainItem?: string;
}

export const AppHeader = ({
  isHeader,
  leftIcon,
  rightItem,
  mainItem,
}: AppHeaderProps) => {
  return (
    <>
      {isHeader && (
        <div
          style={{
            backgroundColor: "white",
            height: 60,
            display: "flex",
            justifyContent: "space-between",
          }}
        >
          <div>{leftIcon}</div>
          <div>{mainItem}</div>
          <div>{rightItem}</div>
        </div>
      )}
    </>
  );
};
